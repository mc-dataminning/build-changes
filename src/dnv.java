import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnv extends dmf {
   public static final MapCodec<dmf> a = mf.e.q().fieldOf("dead");
   public static final MapCodec<dnv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dnv::new));
   private final dmf c;

   public dnv(dmf $$0, eag.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dnv> a() {
      return b;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dig $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         ewo $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axh.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.m();
   }
}
