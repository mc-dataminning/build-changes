import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dah extends cys {
   public static final MapCodec<cys> a = kf.e.q().fieldOf("dead");
   public static final MapCodec<dah> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dah::new));
   private final cys c;

   public dah(cys $$0, dli.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dah> a() {
      return b;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.F_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cux $$0, hz $$1) {
      for (ie $$2 : ie.values()) {
         egw $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(auf.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().F_().a(40));
      }

      return this.o();
   }
}
