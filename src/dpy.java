import com.mojang.serialization.MapCodec;

public class dpy extends dim {
   public static final MapCodec<dpy> n = b(dpy::new);

   @Override
   public MapCodec<dpy> a() {
      return n;
   }

   public dpy(dun.d $$0) {
      super($$0, () -> dru.c);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dtn($$0, $$1);
   }

   @Override
   protected awl<alc> c() {
      return awo.i.b(awo.ai);
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return azd.a(drz.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$3 == jj.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
