import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dje {
   private static final Map<String, dje> k = new Object2ObjectArrayMap();
   public static final Codec<dje> a = atx.a((Function<dje, String>)($$0 -> $$0.l), k::get);
   public static final dje b = new dje(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qp.g), Optional.of(qp.n), Optional.of(qp.C), Optional.of(qp.I)
   );
   public static final dje c = new dje(
      "spruce", 0.5F, Optional.of(qp.q), Optional.of(qp.r), Optional.of(qp.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dje d = new dje(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qp.x), Optional.of(qp.y), Optional.empty(), Optional.empty()
   );
   public static final dje e = new dje("azalea", Optional.empty(), Optional.of(qp.w), Optional.empty());
   public static final dje f = new dje("birch", Optional.empty(), Optional.of(qp.i), Optional.of(qp.F));
   public static final dje g = new dje("jungle", Optional.of(qp.p), Optional.of(qp.o), Optional.empty());
   public static final dje h = new dje("acacia", Optional.empty(), Optional.of(qp.j), Optional.empty());
   public static final dje i = new dje("cherry", Optional.empty(), Optional.of(qp.z), Optional.of(qp.K));
   public static final dje j = new dje("dark_oak", Optional.of(qp.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ahg<drp<?, ?>>> n;
   private final Optional<ahg<drp<?, ?>>> o;
   private final Optional<ahg<drp<?, ?>>> p;
   private final Optional<ahg<drp<?, ?>>> q;
   private final Optional<ahg<drp<?, ?>>> r;
   private final Optional<ahg<drp<?, ?>>> s;

   public dje(String $$0, Optional<ahg<drp<?, ?>>> $$1, Optional<ahg<drp<?, ?>>> $$2, Optional<ahg<drp<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dje(
      String $$0,
      float $$1,
      Optional<ahg<drp<?, ?>>> $$2,
      Optional<ahg<drp<?, ?>>> $$3,
      Optional<ahg<drp<?, ?>>> $$4,
      Optional<ahg<drp<?, ?>>> $$5,
      Optional<ahg<drp<?, ?>>> $$6,
      Optional<ahg<drp<?, ?>>> $$7
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
   private ahg<drp<?, ?>> a(auw $$0, boolean $$1) {
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
   private ahg<drp<?, ?>> a(auw $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(ane $$0, dlm $$1, hx $$2, djp $$3, auw $$4) {
      ahg<drp<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ih<drp<?, ?>> $$6 = $$0.I_().d(ke.aw).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     drp<?, ?> $$9 = $$6.a();
                     djp $$10 = cxa.a.o();
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

      ahg<drp<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ih<drp<?, ?>> $$12 = $$0.I_().d(ke.aw).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            drp<?, ?> $$13 = $$12.a();
            djp $$14 = $$0.b_($$2).g();
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

   private static boolean a(djp $$0, ctd $$1, hx $$2, int $$3, int $$4) {
      cwy $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(cty $$0, hx $$1) {
      for (hx $$2 : hx.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(asi.U)) {
            return true;
         }
      }

      return false;
   }
}
