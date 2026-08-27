import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class diw {
   private static final Map<String, diw> k = new Object2ObjectArrayMap();
   public static final Codec<diw> a = atw.a((Function<diw, String>)($$0 -> $$0.l), k::get);
   public static final diw b = new diw(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qo.g), Optional.of(qo.n), Optional.of(qo.C), Optional.of(qo.I)
   );
   public static final diw c = new diw(
      "spruce", 0.5F, Optional.of(qo.q), Optional.of(qo.r), Optional.of(qo.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final diw d = new diw(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qo.x), Optional.of(qo.y), Optional.empty(), Optional.empty()
   );
   public static final diw e = new diw("azalea", Optional.empty(), Optional.of(qo.w), Optional.empty());
   public static final diw f = new diw("birch", Optional.empty(), Optional.of(qo.i), Optional.of(qo.F));
   public static final diw g = new diw("jungle", Optional.of(qo.p), Optional.of(qo.o), Optional.empty());
   public static final diw h = new diw("acacia", Optional.empty(), Optional.of(qo.j), Optional.empty());
   public static final diw i = new diw("cherry", Optional.empty(), Optional.of(qo.z), Optional.of(qo.K));
   public static final diw j = new diw("dark_oak", Optional.of(qo.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ahf<drh<?, ?>>> n;
   private final Optional<ahf<drh<?, ?>>> o;
   private final Optional<ahf<drh<?, ?>>> p;
   private final Optional<ahf<drh<?, ?>>> q;
   private final Optional<ahf<drh<?, ?>>> r;
   private final Optional<ahf<drh<?, ?>>> s;

   public diw(String $$0, Optional<ahf<drh<?, ?>>> $$1, Optional<ahf<drh<?, ?>>> $$2, Optional<ahf<drh<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public diw(
      String $$0,
      float $$1,
      Optional<ahf<drh<?, ?>>> $$2,
      Optional<ahf<drh<?, ?>>> $$3,
      Optional<ahf<drh<?, ?>>> $$4,
      Optional<ahf<drh<?, ?>>> $$5,
      Optional<ahf<drh<?, ?>>> $$6,
      Optional<ahf<drh<?, ?>>> $$7
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
   private ahf<drh<?, ?>> a(auv $$0, boolean $$1) {
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
   private ahf<drh<?, ?>> a(auv $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(and $$0, dle $$1, hx $$2, djh $$3, auv $$4) {
      ahf<drh<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ih<drh<?, ?>> $$6 = $$0.I_().d(ke.aw).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     drh<?, ?> $$9 = $$6.a();
                     djh $$10 = cws.a.o();
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

      ahf<drh<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ih<drh<?, ?>> $$12 = $$0.I_().d(ke.aw).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            drh<?, ?> $$13 = $$12.a();
            djh $$14 = $$0.b_($$2).g();
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

   private static boolean a(djh $$0, csv $$1, hx $$2, int $$3, int $$4) {
      cwq $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(ctq $$0, hx $$1) {
      for (hx $$2 : hx.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(ash.U)) {
            return true;
         }
      }

      return false;
   }
}
