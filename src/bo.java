import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bo {
   public static final bo a = new bo(bq.a, bf.a, ch.a, ch.a, ck.a, cl.a, bm.a, bl.a, bp.a, null);
   private final bq b;
   private final bf c;
   private final ch d;
   private final ch e;
   private final ck f;
   private final cl g;
   private final bm h;
   private final bl i;
   private final bp j;
   private final bo k;
   private final bo l;
   private final bo m;
   @Nullable
   private final String n;

   private bo(bq $$0, bf $$1, ch $$2, ch $$3, ck $$4, cl $$5, bm $$6, bl $$7, bp $$8, @Nullable String $$9) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.l = this;
      this.k = this;
      this.m = this;
      this.n = $$9;
   }

   bo(bq $$0, bf $$1, ch $$2, ch $$3, ck $$4, cl $$5, bm $$6, bl $$7, bp $$8, bo $$9, bo $$10, bo $$11, @Nullable String $$12) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
      this.l = $$10;
      this.m = $$11;
      this.n = $$12;
   }

   public static ba a(JsonObject $$0, String $$1, be $$2) {
      JsonElement $$3 = $$0.get($$1);
      return a($$1, $$2, $$3);
   }

   public static ba[] b(JsonObject $$0, String $$1, be $$2) {
      JsonElement $$3 = $$0.get($$1);
      if ($$3 != null && !$$3.isJsonNull()) {
         JsonArray $$4 = aor.n($$3, $$1);
         ba[] $$5 = new ba[$$4.size()];

         for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
            $$5[$$6] = a($$1 + "[" + $$6 + "]", $$2, $$4.get($$6));
         }

         return $$5;
      } else {
         return new ba[0];
      }
   }

   private static ba a(String $$0, be $$1, @Nullable JsonElement $$2) {
      ba $$3 = ba.a($$0, $$1, $$2, ebv.k);
      if ($$3 != null) {
         return $$3;
      } else {
         bo $$4 = a($$2);
         return a($$4);
      }
   }

   public static ba a(bo $$0) {
      if ($$0 == a) {
         return ba.a;
      } else {
         eck $$1 = ecn.a(dzk.b.a, $$0).build();
         return new ba(new eck[]{$$1});
      }
   }

   public boolean a(aig $$0, @Nullable bfj $$1) {
      return this.a($$0.x(), $$0.dg(), $$1);
   }

   public boolean a(aif $$0, @Nullable eei $$1, @Nullable bfj $$2) {
      if (this == a) {
         return true;
      } else if ($$2 == null) {
         return false;
      } else if (!this.b.a($$2.ae())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c != bf.a) {
               return false;
            }
         } else if (!this.c.a($$1.c, $$1.d, $$1.e, $$2.dn(), $$2.dp(), $$2.dt())) {
            return false;
         }

         if (!this.d.a($$0, $$2.dn(), $$2.dp(), $$2.dt())) {
            return false;
         } else {
            if (this.e != ch.a) {
               eei $$3 = eei.b($$2.aF());
               if (!this.e.a($$0, $$3.a(), $$3.b(), $$3.c())) {
                  return false;
               }
            }

            if (!this.f.a($$2)) {
               return false;
            } else if (!this.g.a($$2)) {
               return false;
            } else if (!this.h.a($$2)) {
               return false;
            } else if (!this.i.a($$2)) {
               return false;
            } else if (!this.j.a($$2, $$0, $$1)) {
               return false;
            } else if (!this.k.a($$0, $$1, $$2.cW())) {
               return false;
            } else if (this.l != a && $$2.cN().stream().noneMatch($$2x -> this.l.a($$0, $$1, $$2x))) {
               return false;
            } else if (!this.m.a($$0, $$1, $$2 instanceof bgb ? ((bgb)$$2).j() : null)) {
               return false;
            } else {
               if (this.n != null) {
                  efi $$4 = $$2.cd();
                  if ($$4 == null || !this.n.equals($$4.b())) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public static bo a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "entity");
         bq $$2 = bq.a($$1.get("type"));
         bf $$3 = bf.a($$1.get("distance"));
         ch $$4 = ch.a($$1.get("location"));
         ch $$5 = ch.a($$1.get("stepping_on"));
         ck $$6 = ck.a($$1.get("effects"));
         cl $$7 = cl.a($$1.get("nbt"));
         bm $$8 = bm.a($$1.get("flags"));
         bl $$9 = bl.a($$1.get("equipment"));
         bp $$10 = bp.a($$1.get("type_specific"));
         bo $$11 = a($$1.get("vehicle"));
         bo $$12 = a($$1.get("passenger"));
         bo $$13 = a($$1.get("targeted_entity"));
         String $$14 = aor.a($$1, "team", null);
         return new bo.a().a($$2).a($$3).a($$4).b($$5).a($$6).a($$7).a($$8).a($$9).a($$10).a($$14).a($$11).b($$12).c($$13).b();
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.add("type", this.b.a());
         $$0.add("distance", this.c.a());
         $$0.add("location", this.d.a());
         $$0.add("stepping_on", this.e.a());
         $$0.add("effects", this.f.b());
         $$0.add("nbt", this.g.a());
         $$0.add("flags", this.h.a());
         $$0.add("equipment", this.i.a());
         $$0.add("type_specific", this.j.b());
         $$0.add("vehicle", this.k.a());
         $$0.add("passenger", this.l.a());
         $$0.add("targeted_entity", this.m.a());
         $$0.addProperty("team", this.n);
         return $$0;
      }
   }

   public static dzk b(aig $$0, bfj $$1) {
      dzq $$2 = new dzq.a($$0.x()).a(ebw.a, $$1).a(ebw.f, $$0.dg()).a(ebv.k);
      return new dzk.a($$2).a(null);
   }

   public static class a {
      private bq a;
      private bf b;
      private ch c;
      private ch d;
      private ck e;
      private cl f;
      private bm g;
      private bl h;
      private bp i;
      private bo j;
      private bo k;
      private bo l;
      @Nullable
      private String m;

      public a() {
         this.a = bq.a;
         this.b = bf.a;
         this.c = ch.a;
         this.d = ch.a;
         this.e = ck.a;
         this.f = cl.a;
         this.g = bm.a;
         this.h = bl.a;
         this.i = bp.a;
         this.j = bo.a;
         this.k = bo.a;
         this.l = bo.a;
      }

      public static bo.a a() {
         return new bo.a();
      }

      public bo.a a(bfn<?> $$0) {
         this.a = bq.b($$0);
         return this;
      }

      public bo.a a(anl<bfn<?>> $$0) {
         this.a = bq.a($$0);
         return this;
      }

      public bo.a a(bq $$0) {
         this.a = $$0;
         return this;
      }

      public bo.a a(bf $$0) {
         this.b = $$0;
         return this;
      }

      public bo.a a(ch $$0) {
         this.c = $$0;
         return this;
      }

      public bo.a b(ch $$0) {
         this.d = $$0;
         return this;
      }

      public bo.a a(ck $$0) {
         this.e = $$0;
         return this;
      }

      public bo.a a(cl $$0) {
         this.f = $$0;
         return this;
      }

      public bo.a a(bm $$0) {
         this.g = $$0;
         return this;
      }

      public bo.a a(bl $$0) {
         this.h = $$0;
         return this;
      }

      public bo.a a(bp $$0) {
         this.i = $$0;
         return this;
      }

      public bo.a a(bo $$0) {
         this.j = $$0;
         return this;
      }

      public bo.a b(bo $$0) {
         this.k = $$0;
         return this;
      }

      public bo.a c(bo $$0) {
         this.l = $$0;
         return this;
      }

      public bo.a a(@Nullable String $$0) {
         this.m = $$0;
         return this;
      }

      public bo b() {
         return new bo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
      }
   }
}
