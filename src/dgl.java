import com.mojang.serialization.MapCodec;

public class dgl extends daa {
   public static final MapCodec<dgl> h = b(dgl::new);
   public static final dnx<ih.a> i = dnp.I;

   @Override
   public MapCodec<? extends dgl> a() {
      return h;
   }

   public dgl(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(i, ih.a.b));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return b($$0, $$1);
   }

   public static dmz b(dmz $$0, dgm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ih.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ih.a.c);
               case c:
                  return $$0.a(i, ih.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(i);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
