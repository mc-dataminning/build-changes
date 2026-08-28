import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnz extends dqk {
   public static final MapCodec<dnz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ecf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dnz::new)
   );
   public static final ech b = ecg.A;
   private final ecf d;
   private final int f;
   private final Function<ebq, fgw> g;

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   protected dnz(ecf $$0, int $$1, ebp.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.C.b().b(e, jc.c).b(b, Boolean.valueOf(false)).b(c, ecb.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<ebq, fgw> b() {
      fgw $$0 = dno.a(14.0);
      fgw $$1 = dno.a(12.0);
      Map<ecb, Map<jc, fgw>> $$2 = fgt.e(dno.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fgt.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, fgg.e));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$0.c(b)) {
         return bvc.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bvc.a;
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(ebq $$0, dkj $$1, iw $$2, @Nullable csi $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, egq.a, $$2);
   }

   protected void a(@Nullable csi $$0, dkk $$1, iw $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awz.e);
   }

   protected awx a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ebq $$0, dkj $$1, iw $$2) {
      csq $$3 = this.d.e() ? $$1.a(csq.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? egq.a : egq.e, $$2);
      }

      if ($$4) {
         $$1.a(new iw($$2), this, this.f);
      }
   }

   private void e(ebq $$0, dkj $$1, iw $$2) {
      jc $$3 = n($$0).g();
      ezi $$4 = eze.a($$1, $$3, $$3.o().d() ? jc.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e, b, c);
   }
}
