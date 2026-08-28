import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dnv extends dff {
   public static final MapCodec<dnv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dnv::new)
   );
   public static final dsy b = dsx.w;
   public static final dsy c = dsx.a;
   public static final dsy d = dsx.d;
   public static final dsy e = dkt.b;
   public static final dsy f = dkt.c;
   public static final dsy g = dkt.d;
   public static final dsy h = dkt.e;
   private static final Map<jf, dsy> k = dhb.f;
   protected static final ews i = dff.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ews j = dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dff m;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(dff $$0, dsg.d $$1) {
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
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dsh a(cxk $$0) {
      dbj $$1 = $$0.q();
      ja $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), jf.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), jf.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), jf.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), jf.e)));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.B && !$$3.eT().e() && $$3.eT().a(cud.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dxa.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dcd $$0, ja $$1, dsh $$2) {
      for (jf $$3 : new jf[]{jf.d, jf.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ja $$5 = $$1.a($$3, $$4);
            dsh $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dnw.b) == $$3.g()) {
                  dnw.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dcd $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bsd> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bsd $$6 : $$5) {
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
         $$0.a(new ja($$1), this, 10);
      }
   }

   public boolean a(dsh $$0, jf $$1) {
      return $$0.a(this.m) ? $$0.c(dnw.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
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
   protected dsh a(dsh $$0, dkc $$1) {
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
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
