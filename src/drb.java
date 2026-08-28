import com.mojang.serialization.MapCodec;

public class drb extends dtx {
   public static final MapCodec<drb> a = b(drb::new);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jc.a.b));
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      $$3.a($$4, 0.2F, $$0.al().l());
   }
}
