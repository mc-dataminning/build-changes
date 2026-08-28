import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dik extends dgv {
   public static final MapCodec<dgv> a = lu.e.q().fieldOf("dead");
   public static final MapCodec<dik> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dik::new));
   private final dgv c;

   public dik(dgv $$0, dtz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dik> a() {
      return b;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.C_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dcx $$0, je $$1) {
      for (jj $$2 : jj.values()) {
         eqb $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awy.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.o();
   }
}
