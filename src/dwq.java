import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dwq extends drp implements duz {
   public static final MapCodec<dwq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dwq::new)
   );
   public static final ech b = ecg.y;
   public static final eco<ecp> c = ecg.ai;
   public static final ech d = ecg.A;
   public static final ech f = ecg.I;
   private static final Map<jc, fgw> g = fgt.d(dno.c(16.0, 13.0, 16.0));
   private final ecf h;

   @Override
   public MapCodec<? extends dwq> a() {
      return a;
   }

   protected dwq(ecf $$0, ebp.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(e, jc.c).b(b, Boolean.valueOf(false)).b(c, ecp.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == ecp.a ? jc.a : jc.b));
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(f);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!this.h.c()) {
         return bvc.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bvc.a;
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(ebq $$0, dkj $$1, iw $$2, @Nullable csi $$3) {
      ebq $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, eyb.c, eyb.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable csi $$0, dkj $$1, iw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awz.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? egq.h : egq.d, $$2);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, eyb.c, eyb.c.a($$1));
            }
         }
      }
   }

   @Override
   public ebq a(ded $$0) {
      ebq $$1 = this.m();
      eya $$2 = $$0.q().b_($$0.a());
      jc $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? ecp.a : ecp.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == jc.b ? ecp.b : ecp.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == eyb.c));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(f) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected ecf q() {
      return this.h;
   }
}
