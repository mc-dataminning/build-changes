import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgu extends dff {
   public static final MapCodec<dff> a = lq.e.r().fieldOf("dead");
   public static final MapCodec<dgu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgu::new));
   private final dff c;

   public dgu(dff $$0, dsg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgu> a() {
      return b;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dbj $$0, ja $$1) {
      for (jf $$2 : jf.values()) {
         eob $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awa.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
