import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahh implements zh<agr> {
   public static final yy<wl, ahh> a = zh.a(ahh::a, ahh::new);
   private static final int b = 128;
   private static final yy<wl, Int2ObjectMap<czy>> c = yw.a(Int2ObjectOpenHashMap::new, yw.e.a(Short::intValue, Integer::shortValue), czy.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cwb h;
   private final czy i;
   private final Int2ObjectMap<czy> j;

   public ahh(int $$0, int $$1, int $$2, int $$3, cwb $$4, czy $$5, Int2ObjectMap<czy> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahh(wl $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cwb.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = czy.h.decode($$0);
   }

   private void a(wl $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      czy.h.encode($$0, this.i);
   }

   @Override
   public zj<ahh> a() {
      return agp.bz;
   }

   public void a(agr $$0) {
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

   public czy g() {
      return this.i;
   }

   public Int2ObjectMap<czy> h() {
      return this.j;
   }

   public cwb i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
