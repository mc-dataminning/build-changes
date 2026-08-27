import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dja extends dbt implements djh {
   public static final MapCodec<dja> a = b(dja::new);
   public static final dpz b = dpy.F;
   public static final dpz c = dpy.C;
   public static final dpz d = dpy.G;
   protected static final etc e = dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ij.a.b);

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqa $$3) {
      if ($$0 instanceof apu $$4) {
         apv $$5 = dnw.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dmq.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if ($$1 instanceof apu $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dmq.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dmq.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return e;
   }

   @Override
   protected etc f(dpi $$0, cym $$1, id $$2) {
      return e;
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnw($$0, $$1);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == elc.c));
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bnh.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return !$$0.B ? dbt.a($$2, dmq.L, ($$0x, $$1x, $$2x, $$3) -> duk.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
