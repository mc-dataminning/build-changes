import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dsg extends djl {
   public static final MapCodec<dsg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dsg::new)
   );
   public static final dxn b = dxm.B;
   public static final dxn c = dxm.b;
   public static final dxn d = dxm.h;
   public static final dxn e = dpd.b;
   public static final dxn f = dpd.c;
   public static final dxn g = dpd.d;
   public static final dxn h = dpd.e;
   private static final Map<jn, dxn> k = dli.f;
   protected static final fbt i = djl.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fbt j = djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final djl m;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   public dsg(djl $$0, dwv.d $$1) {
      super($$1);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.m = $$0;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dww a(daf $$0) {
      dfm $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jn.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jn.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jn.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jn.e)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4.o().d() ? $$0.b(k.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      if (!$$0.C && !$$3.eZ().f() && $$3.eZ().a(cws.sS)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, ebs.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dgh $$0, ji $$1, dww $$2) {
      for (jn $$3 : new jn[]{jn.d, jn.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ji $$5 = $$1.a($$3, $$4);
            dww $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dsh.b) == $$3.g()) {
                  dsh.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fbt a_(dww $$0, dgh $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dgh $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      List<? extends buk> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dgh $$0, ji $$1, List<? extends buk> $$2) {
      dww $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (buk $$6 : $$2) {
            if (!$$6.s_()) {
               $$5 = true;
               break;
            }
         }
      }

      if ($$5 != $$4) {
         $$3 = $$3.b(b, Boolean.valueOf($$5));
         $$0.a($$1, $$3, 3);
         this.a($$0, $$1, $$3);
      }

      if ($$5) {
         $$0.a(new ji($$1), this, 10);
      }
   }

   public boolean a(dww $$0, jn $$1) {
      return $$0.a(this.m) ? $$0.c(dsh.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      switch ($$1) {
         case c:
            return $$0.b(e, $$0.c(g)).b(f, $$0.c(h)).b(g, $$0.c(e)).b(h, $$0.c(f));
         case d:
            return $$0.b(e, $$0.c(f)).b(f, $$0.c(g)).b(g, $$0.c(h)).b(h, $$0.c(e));
         case b:
            return $$0.b(e, $$0.c(h)).b(f, $$0.c(e)).b(g, $$0.c(f)).b(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      switch ($$1) {
         case b:
            return $$0.b(e, $$0.c(g)).b(g, $$0.c(e));
         case c:
            return $$0.b(f, $$0.c(h)).b(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
