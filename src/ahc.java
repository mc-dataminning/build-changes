import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahc implements zc<agm> {
   public static final yt<wg, ahc> a = zc.a(ahc::a, ahc::new);
   private static final int b = 128;
   private static final yt<wg, Int2ObjectMap<cxy>> c = yr.a(Int2ObjectOpenHashMap::new, yr.e.a(Short::intValue, Integer::shortValue), cxy.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cty h;
   private final cxy i;
   private final Int2ObjectMap<cxy> j;

   public ahc(int $$0, int $$1, int $$2, int $$3, cty $$4, cxy $$5, Int2ObjectMap<cxy> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahc(wg $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cty.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cxy.h.decode($$0);
   }

   private void a(wg $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cxy.h.encode($$0, this.i);
   }

   @Override
   public ze<ahc> a() {
      return agk.bz;
   }

   public void a(agm $$0) {
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

   public cxy g() {
      return this.i;
   }

   public Int2ObjectMap<cxy> h() {
      return this.j;
   }

   public cty i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
