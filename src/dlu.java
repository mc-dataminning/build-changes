import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dlu extends dde {
   public static final MapCodec<dlu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ld.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dlu::new)
   );
   public static final dqy b = dqx.w;
   public static final dqy c = dqx.a;
   public static final dqy d = dqx.d;
   public static final dqy e = dis.b;
   public static final dqy f = dis.c;
   public static final dqy g = dis.d;
   public static final dqy h = dis.e;
   private static final Map<is, dqy> k = dfa.f;
   protected static final eui i = dde.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eui j = dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dde m;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(dde $$0, dqg.d $$1) {
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
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dqh a(cwi $$0) {
      czj $$1 = $$0.q();
      in $$2 = $$0.a();
      return this.n()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), is.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), is.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), is.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), is.e)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$0.B && !$$3.eV().d() && $$3.eV().a(ctc.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dva.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dad $$0, in $$1, dqh $$2) {
      for (is $$3 : new is[]{is.d, is.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            in $$5 = $$1.a($$3, $$4);
            dqh $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dlv.b) == $$3.g()) {
                  dlv.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dad $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends brh> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (brh $$6 : $$5) {
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
         $$0.a(new in($$1), this, 10);
      }
   }

   public boolean a(dqh $$0, is $$1) {
      return $$0.a(this.m) ? $$0.c(dlv.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
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
   protected dqh a(dqh $$0, dib $$1) {
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
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
