import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dpm extends dgv {
   public static final MapCodec<dpm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dpm::new)
   );
   public static final dur b = duq.w;
   public static final dur c = duq.a;
   public static final dur d = duq.d;
   public static final dur e = dmj.b;
   public static final dur f = dmj.c;
   public static final dur g = dmj.d;
   public static final dur h = dmj.e;
   private static final Map<jj, dur> k = dir.f;
   protected static final eyx i = dgv.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eyx j = dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dgv m;

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dgv $$0, dtz.d $$1) {
      super($$1);
      this.l(
         this.E
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
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dua a(cyw $$0) {
      dcx $$1 = $$0.q();
      je $$2 = $$0.a();
      return this.o()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jj.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jj.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jj.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jj.e)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1.o().d() ? $$0.b(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$0.B && !$$3.eW().f() && $$3.eW().a(cvo.rW)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dyx.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dds $$0, je $$1, dua $$2) {
      for (jj $$3 : new jj[]{jj.d, jj.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            je $$5 = $$1.a($$3, $$4);
            dua $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dpn.b) == $$3.g()) {
                  dpn.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dds $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends btj> $$5 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (btj $$6 : $$5) {
            if (!$$6.q_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.b(b, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new je($$1), this, 10);
      }
   }

   public boolean a(dua $$0, jj $$1) {
      return $$0.a(this.m) ? $$0.c(dpn.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
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
   protected dua a(dua $$0, dls $$1) {
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
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
