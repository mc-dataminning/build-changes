import com.mojang.serialization.MapCodec;

public class dqc extends dsy {
   public static final MapCodec<dqc> a = b(dqc::new);

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, ja.a.b));
   }

   @Override
   public void a(dja $$0, eah $$1, iu $$2, bwf $$3, double $$4) {
      $$3.a($$4, 0.2F, $$0.al().l());
   }
}
