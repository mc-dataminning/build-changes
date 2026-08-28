import com.mojang.serialization.MapCodec;

public class dno extends dgd {
   public static final MapCodec<dno> n = b(dno::new);

   @Override
   public MapCodec<dno> a() {
      return n;
   }

   public dno(dsc.d $$0) {
      super($$0, () -> dpk.c);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new drb($$0, $$1);
   }

   @Override
   protected awh<alf> c() {
      return awk.i.b(awk.ai);
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return ayz.a(dpp.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
