import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agz implements zl<agl> {
   public static final zc<wp, agz> a = zl.a(agz::a, agz::new);
   private static final int b = 128;
   private static final zc<wp, Int2ObjectMap<cuh>> c = za.a(Int2ObjectOpenHashMap::new, za.d.a(Short::intValue, Integer::shortValue), cuh.e, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cpp h;
   private final cuh i;
   private final Int2ObjectMap<cuh> j;

   public agz(int $$0, int $$1, int $$2, int $$3, cpp $$4, cuh $$5, Int2ObjectMap<cuh> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agz(wp $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cpp.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cuh.e.decode($$0);
   }

   private void a(wp $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cuh.e.encode($$0, this.i);
   }

   @Override
   public zn<agz> a() {
      return agj.bs;
   }

   public void a(agl $$0) {
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

   public cuh g() {
      return this.i;
   }

   public Int2ObjectMap<cuh> h() {
      return this.j;
   }

   public cpp i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
