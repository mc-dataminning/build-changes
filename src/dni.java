import com.mojang.serialization.MapCodec;

public class dni extends dgv {
   public static final MapCodec<dni> h = b(dni::new);
   public static final duy<jj.a> i = duq.I;

   @Override
   public MapCodec<? extends dni> a() {
      return h;
   }

   public dni(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(i, jj.a.b));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return b($$0, $$1);
   }

   public static dua b(dua $$0, dnj $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jj.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jj.a.c);
               case c:
                  return $$0.b(i, jj.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(i);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(i, $$0.k().o());
   }
}
