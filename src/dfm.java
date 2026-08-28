import com.mojang.serialization.MapCodec;

public abstract class dfm extends dgh {
   private final cue a;

   protected dfm(cue $$0, dtz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dfm> a();

   @Override
   public boolean a(dua $$0) {
      return true;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dqt($$0, $$1, this.a);
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return $$0.c_($$1) instanceof dqt $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cue b() {
      return this.a;
   }
}
