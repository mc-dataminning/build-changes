import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dxc {
   private static final Map<String, dxc> l = new Object2ObjectArrayMap();
   public static final Codec<dxc> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dxc b = new dxc(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sr.g), Optional.of(sr.p), Optional.of(sr.E), Optional.of(sr.K)
   );
   public static final dxc c = new dxc(
      "spruce", 0.5F, Optional.of(sr.s), Optional.of(sr.t), Optional.of(sr.m), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dxc d = new dxc(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sr.z), Optional.of(sr.A), Optional.empty(), Optional.empty()
   );
   public static final dxc e = new dxc("azalea", Optional.empty(), Optional.of(sr.y), Optional.empty());
   public static final dxc f = new dxc("birch", Optional.empty(), Optional.of(sr.k), Optional.of(sr.H));
   public static final dxc g = new dxc("jungle", Optional.of(sr.r), Optional.of(sr.q), Optional.empty());
   public static final dxc h = new dxc("acacia", Optional.empty(), Optional.of(sr.l), Optional.empty());
   public static final dxc i = new dxc("cherry", Optional.empty(), Optional.of(sr.B), Optional.of(sr.M));
   public static final dxc j = new dxc("dark_oak", Optional.of(sr.h), Optional.empty(), Optional.empty());
   public static final dxc k = new dxc("pale_oak", Optional.of(sr.i), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<aly<ega<?, ?>>> o;
   private final Optional<aly<ega<?, ?>>> p;
   private final Optional<aly<ega<?, ?>>> q;
   private final Optional<aly<ega<?, ?>>> r;
   private final Optional<aly<ega<?, ?>>> s;
   private final Optional<aly<ega<?, ?>>> t;

   public dxc(String $$0, Optional<aly<ega<?, ?>>> $$1, Optional<aly<ega<?, ?>>> $$2, Optional<aly<ega<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dxc(
      String $$0,
      float $$1,
      Optional<aly<ega<?, ?>>> $$2,
      Optional<aly<ega<?, ?>>> $$3,
      Optional<aly<ega<?, ?>>> $$4,
      Optional<aly<ega<?, ?>>> $$5,
      Optional<aly<ega<?, ?>>> $$6,
      Optional<aly<ega<?, ?>>> $$7
   ) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
      this.s = $$6;
      this.t = $$7;
      l.put($$0, this);
   }

   @Nullable
   private aly<ega<?, ?>> a(bam $$0, boolean $$1) {
      if ($$0.i() < this.n) {
         if ($$1 && this.t.isPresent()) {
            return this.t.get();
         }

         if (this.r.isPresent()) {
            return this.r.get();
         }
      }

      return $$1 && this.s.isPresent() ? this.s.get() : this.q.orElse(null);
   }

   @Nullable
   private aly<ega<?, ?>> a(bam $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(ash $$0, dzj $$1, jh $$2, dxn $$3, bam $$4) {
      aly<ega<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jq<ega<?, ?>> $$6 = $$0.K_().e(mb.aK).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ega<?, ?> $$9 = $$6.a();
                     dxn $$10 = dkg.a.m();
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

      aly<ega<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jq<ega<?, ?>> $$12 = $$0.K_().e(mb.aK).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ega<?, ?> $$13 = $$12.a();
            dxn $$14 = $$0.b_($$2).g();
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

   private static boolean a(dxn $$0, dgf $$1, jh $$2, int $$3, int $$4) {
      dke $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dhb $$0, jh $$1) {
      for (jh $$2 : jh.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axu.W)) {
            return true;
         }
      }

      return false;
   }
}
