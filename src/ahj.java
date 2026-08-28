import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahj implements zj<agt> {
   public static final za<wn, ahj> a = zj.a(ahj::a, ahj::new);
   private static final int b = 128;
   private static final za<wn, Int2ObjectMap<daa>> c = yy.a(Int2ObjectOpenHashMap::new, yy.e.a(Short::intValue, Integer::shortValue), daa.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cwd h;
   private final daa i;
   private final Int2ObjectMap<daa> j;

   public ahj(int $$0, int $$1, int $$2, int $$3, cwd $$4, daa $$5, Int2ObjectMap<daa> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahj(wn $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cwd.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = daa.h.decode($$0);
   }

   private void a(wn $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      daa.h.encode($$0, this.i);
   }

   @Override
   public zl<ahj> a() {
      return agr.bz;
   }

   public void a(agt $$0) {
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

   public daa g() {
      return this.i;
   }

   public Int2ObjectMap<daa> h() {
      return this.j;
   }

   public cwd i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
