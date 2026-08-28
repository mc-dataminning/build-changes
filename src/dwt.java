import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dwt extends dno {
   public static final MapCodec<dwt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("hook").forGetter($$0x -> $$0x.T), t()).apply($$0, dwt::new)
   );
   public static final ech b = ecg.A;
   public static final ech c = ecg.a;
   public static final ech d = ecg.g;
   public static final ech e = dti.b;
   public static final ech f = dti.c;
   public static final ech g = dti.d;
   public static final ech h = dti.e;
   private static final Map<jc, ech> i = dpm.f;
   private static final fgw D = dno.b(16.0, 1.0, 2.5);
   private static final fgw R = dno.b(16.0, 0.0, 8.0);
   private static final int S = 10;
   private final dno T;

   @Override
   public MapCodec<dwt> a() {
      return a;
   }

   public dwt(dno $$0, ebp.d $$1) {
      super($$1);
      this.l(
         this.C
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.T = $$0;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$0.c(c) ? D : R;
   }

   @Override
   public ebq a(ded $$0) {
      djn $$1 = $$0.q();
      iw $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jc.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jc.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jc.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jc.e)));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if (!$$0.C && !$$3.fb().f() && $$3.fb().a(dao.td)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, egq.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dkj $$0, iw $$1, ebq $$2) {
      for (jc $$3 : new jc[]{jc.d, jc.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iw $$5 = $$1.a($$3, $$4);
            ebq $$6 = $$0.a_($$5);
            if ($$6.a(this.T)) {
               if ($$6.c(dwu.b) == $$3.g()) {
                  dwu.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fgw a(ebq $$0, djn $$1, iw $$2, bxe $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dkj $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      List<? extends bxe> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dkj $$0, iw $$1, List<? extends bxe> $$2) {
      ebq $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bxe $$6 : $$2) {
            if (!$$6.g_()) {
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
         $$0.a(new iw($$1), this, 10);
      }
   }

   public boolean a(ebq $$0, jc $$1) {
      return $$0.a(this.T) ? $$0.c(dwu.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
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
   protected ebq a(ebq $$0, dsr $$1) {
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
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
