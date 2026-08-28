import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahd implements zd<agn> {
   public static final yu<wh, ahd> a = zd.a(ahd::a, ahd::new);
   private static final int b = 128;
   private static final yu<wh, Int2ObjectMap<cys>> c = ys.a(Int2ObjectOpenHashMap::new, ys.e.a(Short::intValue, Integer::shortValue), cys.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cuv h;
   private final cys i;
   private final Int2ObjectMap<cys> j;

   public ahd(int $$0, int $$1, int $$2, int $$3, cuv $$4, cys $$5, Int2ObjectMap<cys> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahd(wh $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cuv.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cys.h.decode($$0);
   }

   private void a(wh $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cys.h.encode($$0, this.i);
   }

   @Override
   public zf<ahd> a() {
      return agl.bz;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.g;
   }

   public cys g() {
      return this.i;
   }

   public Int2ObjectMap<cys> h() {
      return this.j;
   }

   public cuv i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
