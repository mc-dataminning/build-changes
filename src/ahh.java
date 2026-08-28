import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahh implements zl<agr> {
   public static final zc<wp, ahh> a = zl.a(ahh::a, ahh::new);
   private static final int b = 128;
   private static final zc<wp, Int2ObjectMap<cvs>> c = za.a(Int2ObjectOpenHashMap::new, za.e.a(Short::intValue, Integer::shortValue), cvs.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final crk h;
   private final cvs i;
   private final Int2ObjectMap<cvs> j;

   public ahh(int $$0, int $$1, int $$2, int $$3, crk $$4, cvs $$5, Int2ObjectMap<cvs> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahh(wp $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(crk.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cvs.h.decode($$0);
   }

   private void a(wp $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cvs.h.encode($$0, this.i);
   }

   @Override
   public zn<ahh> a() {
      return agp.bv;
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

   public cvs g() {
      return this.i;
   }

   public Int2ObjectMap<cvs> h() {
      return this.j;
   }

   public crk i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
