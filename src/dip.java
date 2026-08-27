import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dip {
   private static final Map<String, dip> k = new Object2ObjectArrayMap();
   public static final Codec<dip> a = atq.a((Function<dip, String>)($$0 -> $$0.l), k::get);
   public static final dip b = new dip(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qm.g), Optional.of(qm.n), Optional.of(qm.C), Optional.of(qm.I)
   );
   public static final dip c = new dip(
      "spruce", 0.5F, Optional.of(qm.q), Optional.of(qm.r), Optional.of(qm.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dip d = new dip(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qm.x), Optional.of(qm.y), Optional.empty(), Optional.empty()
   );
   public static final dip e = new dip("azalea", Optional.empty(), Optional.of(qm.w), Optional.empty());
   public static final dip f = new dip("birch", Optional.empty(), Optional.of(qm.i), Optional.of(qm.F));
   public static final dip g = new dip("jungle", Optional.of(qm.p), Optional.of(qm.o), Optional.empty());
   public static final dip h = new dip("acacia", Optional.empty(), Optional.of(qm.j), Optional.empty());
   public static final dip i = new dip("cherry", Optional.empty(), Optional.of(qm.z), Optional.of(qm.K));
   public static final dip j = new dip("dark_oak", Optional.of(qm.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ahc<dra<?, ?>>> n;
   private final Optional<ahc<dra<?, ?>>> o;
   private final Optional<ahc<dra<?, ?>>> p;
   private final Optional<ahc<dra<?, ?>>> q;
   private final Optional<ahc<dra<?, ?>>> r;
   private final Optional<ahc<dra<?, ?>>> s;

   public dip(String $$0, Optional<ahc<dra<?, ?>>> $$1, Optional<ahc<dra<?, ?>>> $$2, Optional<ahc<dra<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dip(
      String $$0,
      float $$1,
      Optional<ahc<dra<?, ?>>> $$2,
      Optional<ahc<dra<?, ?>>> $$3,
      Optional<ahc<dra<?, ?>>> $$4,
      Optional<ahc<dra<?, ?>>> $$5,
      Optional<ahc<dra<?, ?>>> $$6,
      Optional<ahc<dra<?, ?>>> $$7
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
   private ahc<dra<?, ?>> a(aup $$0, boolean $$1) {
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
   private ahc<dra<?, ?>> a(aup $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(amz $$0, dkx $$1, hx $$2, dja $$3, aup $$4) {
      ahc<dra<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ih<dra<?, ?>> $$6 = $$0.I_().d(ke.aw).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dra<?, ?> $$9 = $$6.a();
                     dja $$10 = cwl.a.o();
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

      ahc<dra<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ih<dra<?, ?>> $$12 = $$0.I_().d(ke.aw).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dra<?, ?> $$13 = $$12.a();
            dja $$14 = $$0.b_($$2).g();
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

   private static boolean a(dja $$0, cso $$1, hx $$2, int $$3, int $$4) {
      cwj $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(ctj $$0, hx $$1) {
      for (hx $$2 : hx.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(asb.U)) {
            return true;
         }
      }

      return false;
   }
}
