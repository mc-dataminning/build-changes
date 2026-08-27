import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bz {
   public static final bz a = new bz();
   @Nullable
   private final anl<cfu> b;
   @Nullable
   private final Set<cfu> c;
   private final cj.d d;
   private final cj.d e;
   private final bj[] f;
   private final bj[] g;
   @Nullable
   private final chw h;
   private final cl i;

   public bz() {
      this.b = null;
      this.c = null;
      this.h = null;
      this.d = cj.d.e;
      this.e = cj.d.e;
      this.f = bj.b;
      this.g = bj.b;
      this.i = cl.a;
   }

   public bz(@Nullable anl<cfu> $$0, @Nullable Set<cfu> $$1, cj.d $$2, cj.d $$3, bj[] $$4, bj[] $$5, @Nullable chw $$6, cl $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public boolean a(cfz $$0) {
      if (this == a) {
         return true;
      } else if (this.b != null && !$$0.a(this.b)) {
         return false;
      } else if (this.c != null && !this.c.contains($$0.d())) {
         return false;
      } else if (!this.d.d($$0.L())) {
         return false;
      } else if (!this.e.c() && !$$0.i()) {
         return false;
      } else if (!this.e.d($$0.l() - $$0.k())) {
         return false;
      } else if (!this.i.a($$0)) {
         return false;
      } else {
         if (this.f.length > 0) {
            Map<ckg, Integer> $$1 = cki.a($$0.x());

            for (bj $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (this.g.length > 0) {
            Map<ckg, Integer> $$3 = cki.a(cev.d($$0));

            for (bj $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         chw $$5 = chy.d($$0);
         return this.h == null || this.h == $$5;
      }
   }

   public static bz a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "item");
         cj.d $$2 = cj.d.a($$1.get("count"));
         cj.d $$3 = cj.d.a($$1.get("durability"));
         if ($$1.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            cl $$4 = cl.a($$1.get("nbt"));
            Set<cfu> $$5 = null;
            JsonArray $$6 = aor.a($$1, "items", null);
            if ($$6 != null) {
               Builder<cfu> $$7 = ImmutableSet.builder();

               for (JsonElement $$8 : $$6) {
                  acq $$9 = new acq(aor.a($$8, "item"));
                  $$7.add(jb.i.b($$9).orElseThrow(() -> new JsonSyntaxException("Unknown item id '" + $$9 + "'")));
               }

               $$5 = $$7.build();
            }

            anl<cfu> $$10 = null;
            if ($$1.has("tag")) {
               acq $$11 = new acq(aor.i($$1, "tag"));
               $$10 = anl.a(jc.D, $$11);
            }

            chw $$12 = null;
            if ($$1.has("potion")) {
               acq $$13 = new acq(aor.i($$1, "potion"));
               $$12 = jb.j.b($$13).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$13 + "'"));
            }

            bj[] $$14 = bj.b($$1.get("enchantments"));
            bj[] $$15 = bj.b($$1.get("stored_enchantments"));
            return new bz($$10, $$5, $$2, $$3, $$14, $$15, $$12, $$4);
         }
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.c != null) {
            JsonArray $$1 = new JsonArray();

            for (cfu $$2 : this.c) {
               $$1.add(jb.i.b($$2).toString());
            }

            $$0.add("items", $$1);
         }

         if (this.b != null) {
            $$0.addProperty("tag", this.b.b().toString());
         }

         $$0.add("count", this.d.d());
         $$0.add("durability", this.e.d());
         $$0.add("nbt", this.i.a());
         if (this.f.length > 0) {
            JsonArray $$3 = new JsonArray();

            for (bj $$4 : this.f) {
               $$3.add($$4.a());
            }

            $$0.add("enchantments", $$3);
         }

         if (this.g.length > 0) {
            JsonArray $$5 = new JsonArray();

            for (bj $$6 : this.g) {
               $$5.add($$6.a());
            }

            $$0.add("stored_enchantments", $$5);
         }

         if (this.h != null) {
            $$0.addProperty("potion", jb.j.b(this.h).toString());
         }

         return $$0;
      }
   }

   public static bz[] b(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonArray $$1 = aor.n($$0, "items");
         bz[] $$2 = new bz[$$1.size()];

         for (int $$3 = 0; $$3 < $$2.length; $$3++) {
            $$2[$$3] = a($$1.get($$3));
         }

         return $$2;
      } else {
         return new bz[0];
      }
   }

   public static class a {
      private final List<bj> a = Lists.newArrayList();
      private final List<bj> b = Lists.newArrayList();
      @Nullable
      private Set<cfu> c;
      @Nullable
      private anl<cfu> d;
      private cj.d e;
      private cj.d f;
      @Nullable
      private chw g;
      private cl h;

      private a() {
         this.e = cj.d.e;
         this.f = cj.d.e;
         this.h = cl.a;
      }

      public static bz.a a() {
         return new bz.a();
      }

      public bz.a a(cml... $$0) {
         this.c = Stream.of($$0).map(cml::k).collect(ImmutableSet.toImmutableSet());
         return this;
      }

      public bz.a a(anl<cfu> $$0) {
         this.d = $$0;
         return this;
      }

      public bz.a a(cj.d $$0) {
         this.e = $$0;
         return this;
      }

      public bz.a b(cj.d $$0) {
         this.f = $$0;
         return this;
      }

      public bz.a a(chw $$0) {
         this.g = $$0;
         return this;
      }

      public bz.a a(qr $$0) {
         this.h = new cl($$0);
         return this;
      }

      public bz.a a(bj $$0) {
         this.a.add($$0);
         return this;
      }

      public bz.a b(bj $$0) {
         this.b.add($$0);
         return this;
      }

      public bz b() {
         return new bz(this.d, this.c, this.e, this.f, this.a.toArray(bj.b), this.b.toArray(bj.b), this.g, this.h);
      }
   }
}
