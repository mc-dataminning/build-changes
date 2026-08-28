import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dno extends dgh {
   public static final MapCodec<dno> a = b(dno::new);
   public static final dur b = duq.E;
   private final bqp c = bqm.a(5);

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dsm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? null : a($$2, drg.K, dsm::a);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
