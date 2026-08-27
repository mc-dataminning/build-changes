import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dcr extends dfb {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dpx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dcr::new)
   );
   public static final dpz b = dpy.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final etc e = dch.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final etc f = dch.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final etc g = dch.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final etc h = dch.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final etc i = dch.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final etc j = dch.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final etc k = dch.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final etc l = dch.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final etc m = dch.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final etc n = dch.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final etc o = dch.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final etc F = dch.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final etc G = dch.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final etc H = dch.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final etc I = dch.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final etc J = dch.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dpx N;
   private final int O;

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   protected dcr(dpx $$0, int $$1, dph.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ij.c).a(b, Boolean.valueOf(false)).a(K, dpt.b));
      this.O = $$1;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      ij $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dpt)$$0.c(K)) {
         case a:
            if ($$4.o() == ij.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? F : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? J : l;
               case e -> $$5 ? I : k;
               case d -> $$5 ? H : j;
               case c, b, a -> $$5 ? G : i;
            };
         case c:
         default:
            if ($$4.o() == ij.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$0.c(b)) {
         return bof.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dub.a, $$2);
         return bof.a($$1.B);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if ($$3.j() == cyy.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dpi $$0, czg $$1, id $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cka $$0, czh $$1, id $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aup.e);
   }

   protected aun a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dpi $$0, czg $$1, id $$2) {
      ckg $$3 = this.N.e() ? $$1.a(ckg.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dub.a : dub.e, $$2);
      }

      if ($$4) {
         $$1.a(new id($$2), this, this.O);
      }
   }

   private void f(dpi $$0, czg $$1, id $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(aE, b, K);
   }
}
