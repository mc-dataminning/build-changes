import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dud {
   private static final Map<String, dud> k = new Object2ObjectArrayMap();
   public static final Codec<dud> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dud b = new dud(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rz.g), Optional.of(rz.n), Optional.of(rz.C), Optional.of(rz.I)
   );
   public static final dud c = new dud(
      "spruce", 0.5F, Optional.of(rz.q), Optional.of(rz.r), Optional.of(rz.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dud d = new dud(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rz.x), Optional.of(rz.y), Optional.empty(), Optional.empty()
   );
   public static final dud e = new dud("azalea", Optional.empty(), Optional.of(rz.w), Optional.empty());
   public static final dud f = new dud("birch", Optional.empty(), Optional.of(rz.i), Optional.of(rz.F));
   public static final dud g = new dud("jungle", Optional.of(rz.p), Optional.of(rz.o), Optional.empty());
   public static final dud h = new dud("acacia", Optional.empty(), Optional.of(rz.j), Optional.empty());
   public static final dud i = new dud("cherry", Optional.empty(), Optional.of(rz.z), Optional.of(rz.K));
   public static final dud j = new dud("dark_oak", Optional.of(rz.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<alb<edc<?, ?>>> n;
   private final Optional<alb<edc<?, ?>>> o;
   private final Optional<alb<edc<?, ?>>> p;
   private final Optional<alb<edc<?, ?>>> q;
   private final Optional<alb<edc<?, ?>>> r;
   private final Optional<alb<edc<?, ?>>> s;

   public dud(String $$0, Optional<alb<edc<?, ?>>> $$1, Optional<alb<edc<?, ?>>> $$2, Optional<alb<edc<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dud(
      String $$0,
      float $$1,
      Optional<alb<edc<?, ?>>> $$2,
      Optional<alb<edc<?, ?>>> $$3,
      Optional<alb<edc<?, ?>>> $$4,
      Optional<alb<edc<?, ?>>> $$5,
      Optional<alb<edc<?, ?>>> $$6,
      Optional<alb<edc<?, ?>>> $$7
   ) {
      this.l = $$0;
      this.m = $$1;
      this.n = $$2;
      this.o = $$3;
      this.p = $$4;
      this.q = $$5;
      this.r = $$6;
      this.s = $$7;
      k.put($$0, this);
   }

   @Nullable
   private alb<edc<?, ?>> a(azl $$0, boolean $$1) {
      if ($$0.i() < this.m) {
         if ($$1 && this.s.isPresent()) {
            return this.s.get();
         }

         if (this.q.isPresent()) {
            return this.q.get();
         }
      }

      return $$1 && this.r.isPresent() ? this.r.get() : this.p.orElse(null);
   }

   @Nullable
   private alb<edc<?, ?>> a(azl $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arh $$0, dwl $$1, je $$2, duo $$3, azl $$4) {
      alb<edc<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jn<edc<?, ?>> $$6 = $$0.F_().d(lv.aJ).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     edc<?, ?> $$9 = $$6.a();
                     duo $$10 = dhl.a.o();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 4);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 4);
                     return false;
                  }
               }
            }
         }
      }

      alb<edc<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jn<edc<?, ?>> $$12 = $$0.F_().d(lv.aJ).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            edc<?, ?> $$13 = $$12.a();
            duo $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 4);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 4);
               return false;
            }
         }
      }
   }

   private static boolean a(duo $$0, ddl $$1, je $$2, int $$3, int $$4) {
      dhj $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(deh $$0, je $$1) {
      for (je $$2 : je.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awt.V)) {
            return true;
         }
      }

      return false;
   }
}
