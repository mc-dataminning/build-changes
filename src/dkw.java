import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dkw extends dch {
   public static final MapCodec<dkw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kt.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dkw::new)
   );
   public static final dpz b = dpy.w;
   public static final dpz c = dpy.a;
   public static final dpz d = dpy.d;
   public static final dpz e = dhu.b;
   public static final dpz f = dhu.c;
   public static final dpz g = dhu.d;
   public static final dpz h = dhu.e;
   private static final Map<ij, dpz> k = ded.f;
   protected static final etc i = dch.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final etc j = dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dch m;

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(dch $$0, dph.d $$1) {
      super($$1);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
      );
      this.m = $$0;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dpi a(cux $$0) {
      cym $$1 = $$0.q();
      id $$2 = $$0.a();
      return this.n()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ij.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ij.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ij.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ij.e)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$0.B && !$$3.eU().d() && $$3.eU().a(crv.rU)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dub.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(czg $$0, id $$1, dpi $$2) {
      for (ij $$3 : new ij[]{ij.d, ij.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            id $$5 = $$1.a($$3, $$4);
            dpi $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dkx.b) == $$3.g()) {
                  dkx.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(czg $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bqa> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bqa $$6 : $$5) {
            if (!$$6.r_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.a(b, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new id($$1), this, 10);
      }
   }

   public boolean a(dpi $$0, ij $$1) {
      return $$0.a(this.m) ? $$0.c(dkx.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      switch ($$1) {
         case c:
            return $$0.a(e, $$0.c(g)).a(f, $$0.c(h)).a(g, $$0.c(e)).a(h, $$0.c(f));
         case d:
            return $$0.a(e, $$0.c(f)).a(f, $$0.c(g)).a(g, $$0.c(h)).a(h, $$0.c(e));
         case b:
            return $$0.a(e, $$0.c(h)).a(f, $$0.c(e)).a(g, $$0.c(f)).a(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      switch ($$1) {
         case b:
            return $$0.a(e, $$0.c(g)).a(g, $$0.c(e));
         case c:
            return $$0.a(f, $$0.c(h)).a(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
