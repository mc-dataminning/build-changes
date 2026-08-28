import com.mojang.serialization.MapCodec;

public class dml extends dfy {
   public static final MapCodec<dml> h = b(dml::new);
   public static final dua<ji.a> i = dts.I;

   @Override
   public MapCodec<? extends dml> a() {
      return h;
   }

   public dml(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(i, ji.a.b));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return b($$0, $$1);
   }

   public static dtc b(dtc $$0, dmm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ji.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ji.a.c);
               case c:
                  return $$0.a(i, ji.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(i);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
