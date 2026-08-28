import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahr implements zr<ahb> {
   public static final zi<wv, ahr> a = zr.a(ahr::a, ahr::new);
   private static final int b = 128;
   private static final zi<wv, Int2ObjectMap<cxg>> c = zg.a(Int2ObjectOpenHashMap::new, zg.e.a(Short::intValue, Integer::shortValue), cxg.g, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cte h;
   private final cxg i;
   private final Int2ObjectMap<cxg> j;

   public ahr(int $$0, int $$1, int $$2, int $$3, cte $$4, cxg $$5, Int2ObjectMap<cxg> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahr(wv $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cte.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cxg.g.decode($$0);
   }

   private void a(wv $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cxg.g.encode($$0, this.i);
   }

   @Override
   public zt<ahr> a() {
      return agz.bz;
   }

   public void a(ahb $$0) {
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

   public cxg g() {
      return this.i;
   }

   public Int2ObjectMap<cxg> h() {
      return this.j;
   }

   public cte i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
