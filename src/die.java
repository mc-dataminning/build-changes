import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class die {
   private static final Map<String, die> k = new Object2ObjectArrayMap();
   public static final Codec<die> a = atg.a((Function<die, String>)($$0 -> $$0.l), k::get);
   public static final die b = new die(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qk.g), Optional.of(qk.n), Optional.of(qk.C), Optional.of(qk.I)
   );
   public static final die c = new die(
      "spruce", 0.5F, Optional.of(qk.q), Optional.of(qk.r), Optional.of(qk.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final die d = new die(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qk.x), Optional.of(qk.y), Optional.empty(), Optional.empty()
   );
   public static final die e = new die("azalea", Optional.empty(), Optional.of(qk.w), Optional.empty());
   public static final die f = new die("birch", Optional.empty(), Optional.of(qk.i), Optional.of(qk.F));
   public static final die g = new die("jungle", Optional.of(qk.p), Optional.of(qk.o), Optional.empty());
   public static final die h = new die("acacia", Optional.empty(), Optional.of(qk.j), Optional.empty());
   public static final die i = new die("cherry", Optional.empty(), Optional.of(qk.z), Optional.of(qk.K));
   public static final die j = new die("dark_oak", Optional.of(qk.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ags<dqp<?, ?>>> n;
   private final Optional<ags<dqp<?, ?>>> o;
   private final Optional<ags<dqp<?, ?>>> p;
   private final Optional<ags<dqp<?, ?>>> q;
   private final Optional<ags<dqp<?, ?>>> r;
   private final Optional<ags<dqp<?, ?>>> s;

   public die(String $$0, Optional<ags<dqp<?, ?>>> $$1, Optional<ags<dqp<?, ?>>> $$2, Optional<ags<dqp<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public die(
      String $$0,
      float $$1,
      Optional<ags<dqp<?, ?>>> $$2,
      Optional<ags<dqp<?, ?>>> $$3,
      Optional<ags<dqp<?, ?>>> $$4,
      Optional<ags<dqp<?, ?>>> $$5,
      Optional<ags<dqp<?, ?>>> $$6,
      Optional<ags<dqp<?, ?>>> $$7
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
   private ags<dqp<?, ?>> a(auf $$0, boolean $$1) {
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
   private ags<dqp<?, ?>> a(auf $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(amp $$0, dkm $$1, hv $$2, dip $$3, auf $$4) {
      ags<dqp<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ie<dqp<?, ?>> $$6 = $$0.I_().d(kc.av).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dqp<?, ?> $$9 = $$6.a();
                     dip $$10 = cwb.a.o();
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

      ags<dqp<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ie<dqp<?, ?>> $$12 = $$0.I_().d(kc.av).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dqp<?, ?> $$13 = $$12.a();
            dip $$14 = $$0.b_($$2).g();
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

   private static boolean a(dip $$0, cse $$1, hv $$2, int $$3, int $$4) {
      cvz $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(csz $$0, hv $$1) {
      for (hv $$2 : hv.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(arr.U)) {
            return true;
         }
      }

      return false;
   }
}
