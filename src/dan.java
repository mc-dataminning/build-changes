import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dan extends dgs {
   public static final MapCodec<dan> a = b(dan::new);
   public static final dnt b = dnp.R;

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   public dan(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(b, ih.c));
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return !$$0.B ? a($$2, dki.J, ($$0x, $$1x, $$2x, $$3) -> drw.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
