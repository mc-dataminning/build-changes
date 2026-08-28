import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkz extends djk {
   public static final MapCodec<djk> a = mb.e.q().fieldOf("dead");
   public static final MapCodec<dkz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dkz::new));
   private final djk c;

   public dkz(djk $$0, dwu.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dkz> a() {
      return b;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dfl $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         esx $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awu.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().H_().a(40));
      }

      return this.m();
   }
}
