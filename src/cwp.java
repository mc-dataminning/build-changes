import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwp extends cva {
   public static final MapCodec<cva> a = jy.f.q().fieldOf("dead");
   public static final MapCodec<cwp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, cwp::new));
   private final cva c;

   public cwp(cva $$0, dhh.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cwp> a() {
      return b;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(crg $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         ecs $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(arl.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
