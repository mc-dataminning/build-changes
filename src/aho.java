import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class aho implements zs<agy> {
   public static final zj<ww, aho> a = zs.a(aho::a, aho::new);
   private static final int b = 128;
   private static final zj<ww, Int2ObjectMap<cwf>> c = zh.a(Int2ObjectOpenHashMap::new, zh.e.a(Short::intValue, Integer::shortValue), cwf.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final csd h;
   private final cwf i;
   private final Int2ObjectMap<cwf> j;

   public aho(int $$0, int $$1, int $$2, int $$3, csd $$4, cwf $$5, Int2ObjectMap<cwf> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private aho(ww $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(csd.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cwf.h.decode($$0);
   }

   private void a(ww $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cwf.h.encode($$0, this.i);
   }

   @Override
   public zu<aho> a() {
      return agw.bv;
   }

   public void a(agy $$0) {
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

   public cwf g() {
      return this.i;
   }

   public Int2ObjectMap<cwf> h() {
      return this.j;
   }

   public csd i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
