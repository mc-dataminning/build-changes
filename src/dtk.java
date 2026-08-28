import com.mojang.serialization.MapCodec;

public class dtk extends dmr {
   public static final MapCodec<dtk> c = b(dtk::new);
   public static final ebr<jb.a> d = ebj.K;

   @Override
   public MapCodec<? extends dtk> a() {
      return c;
   }

   public dtk(eas.d $$0) {
      super($$0);
      this.l(this.m().b(d, jb.a.b));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return b($$0, $$1);
   }

   public static eat b(eat $$0, dtl $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jb.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jb.a.c);
               case c:
                  return $$0.b(d, jb.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
