import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class diy extends dhj {
   public static final MapCodec<dhj> a = lu.e.q().fieldOf("dead");
   public static final MapCodec<diy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, diy::new));
   private final dhj c;

   public diy(dhj $$0, dun.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<diy> a() {
      return b;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.C_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(ddl $$0, je $$1) {
      for (jj $$2 : jj.values()) {
         eqp $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awz.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.o();
   }
}
