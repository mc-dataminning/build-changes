import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahl implements zp<agv> {
   public static final zg<wt, ahl> a = zp.a(ahl::a, ahl::new);
   private static final int b = 128;
   private static final zg<wt, Int2ObjectMap<cwb>> c = ze.a(Int2ObjectOpenHashMap::new, ze.e.a(Short::intValue, Integer::shortValue), cwb.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final crz h;
   private final cwb i;
   private final Int2ObjectMap<cwb> j;

   public ahl(int $$0, int $$1, int $$2, int $$3, crz $$4, cwb $$5, Int2ObjectMap<cwb> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahl(wt $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(crz.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cwb.h.decode($$0);
   }

   private void a(wt $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cwb.h.encode($$0, this.i);
   }

   @Override
   public zr<ahl> a() {
      return agt.bv;
   }

   public void a(agv $$0) {
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

   public cwb g() {
      return this.i;
   }

   public Int2ObjectMap<cwb> h() {
      return this.j;
   }

   public crz i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
