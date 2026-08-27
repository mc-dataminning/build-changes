import com.mojang.serialization.MapCodec;

public abstract class day extends dbt {
   private final cql a;

   protected day(cql $$0, dph.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends day> a();

   @Override
   public boolean a(dpi $$0) {
      return true;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmd($$0, $$1, this.a);
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return $$0.c_($$1) instanceof dmd $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cql b() {
      return this.a;
   }
}
