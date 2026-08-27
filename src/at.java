import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Set;
import javax.annotation.Nullable;

public class at {
   public static final at a = new at(null, null, cz.a, cl.a);
   @Nullable
   private final anl<cpn> b;
   @Nullable
   private final Set<cpn> c;
   private final cz d;
   private final cl e;

   public at(@Nullable anl<cpn> $$0, @Nullable Set<cpn> $$1, cz $$2, cl $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public boolean a(aif $$0, gu $$1) {
      if (this == a) {
         return true;
      } else if (!$$0.o($$1)) {
         return false;
      } else {
         dcb $$2 = $$0.a_($$1);
         if (this.b != null && !$$2.a(this.b)) {
            return false;
         } else if (this.c != null && !this.c.contains($$2.b())) {
            return false;
         } else if (!this.d.a($$2)) {
            return false;
         } else {
            if (this.e != cl.a) {
               czn $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.a($$3.m())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public static at a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "block");
         cl $$2 = cl.a($$1.get("nbt"));
         Set<cpn> $$3 = null;
         JsonArray $$4 = aor.a($$1, "blocks", null);
         if ($$4 != null) {
            Builder<cpn> $$5 = ImmutableSet.builder();

            for (JsonElement $$6 : $$4) {
               acq $$7 = new acq(aor.a($$6, "block"));
               $$5.add(jb.f.b($$7).orElseThrow(() -> new JsonSyntaxException("Unknown block id '" + $$7 + "'")));
            }

            $$3 = $$5.build();
         }

         anl<cpn> $$8 = null;
         if ($$1.has("tag")) {
            acq $$9 = new acq(aor.i($$1, "tag"));
            $$8 = anl.a(jc.e, $$9);
         }

         cz $$10 = cz.a($$1.get("state"));
         return new at($$8, $$3, $$10, $$2);
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

            for (cpn $$2 : this.c) {
               $$1.add(jb.f.b($$2).toString());
            }

            $$0.add("blocks", $$1);
         }

         if (this.b != null) {
            $$0.addProperty("tag", this.b.b().toString());
         }

         $$0.add("nbt", this.e.a());
         $$0.add("state", this.d.a());
         return $$0;
      }
   }

   public static class a {
      @Nullable
      private Set<cpn> a;
      @Nullable
      private anl<cpn> b;
      private cz c = cz.a;
      private cl d = cl.a;

      private a() {
      }

      public static at.a a() {
         return new at.a();
      }

      public at.a a(cpn... $$0) {
         this.a = ImmutableSet.copyOf($$0);
         return this;
      }

      public at.a a(Iterable<cpn> $$0) {
         this.a = ImmutableSet.copyOf($$0);
         return this;
      }

      public at.a a(anl<cpn> $$0) {
         this.b = $$0;
         return this;
      }

      public at.a a(qr $$0) {
         this.d = new cl($$0);
         return this;
      }

      public at.a a(cz $$0) {
         this.c = $$0;
         return this;
      }

      public at b() {
         return new at(this.b, this.a, this.c, this.d);
      }
   }
}
