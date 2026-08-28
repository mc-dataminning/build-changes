import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agw implements zf<agh> {
   public static final yw<wj, agw> a = zf.a(agw::a, agw::new);
   private static final int b = 128;
   private static final yw<wj, Int2ObjectMap<cuo>> c = yu.a(Int2ObjectOpenHashMap::new, yu.d.a(Short::intValue, Integer::shortValue), cuo.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cqc h;
   private final cuo i;
   private final Int2ObjectMap<cuo> j;

   public agw(int $$0, int $$1, int $$2, int $$3, cqc $$4, cuo $$5, Int2ObjectMap<cuo> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agw(wj $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cqc.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cuo.h.decode($$0);
   }

   private void a(wj $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cuo.h.encode($$0, this.i);
   }

   @Override
   public zh<agw> a() {
      return agf.bs;
   }

   public void a(agh $$0) {
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

   public cuo g() {
      return this.i;
   }

   public Int2ObjectMap<cuo> h() {
      return this.j;
   }

   public cqc i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
