import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahk implements zv<agv> {
   public static final zm<wz, ahk> a = zv.a(ahk::a, ahk::new);
   private static final int b = 128;
   private static final zm<wz, Int2ObjectMap<cun>> c = zk.a(Int2ObjectOpenHashMap::new, zk.d.a(Short::intValue, Integer::shortValue), cun.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cqb h;
   private final cun i;
   private final Int2ObjectMap<cun> j;

   public ahk(int $$0, int $$1, int $$2, int $$3, cqb $$4, cun $$5, Int2ObjectMap<cun> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahk(wz $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cqb.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cun.h.decode($$0);
   }

   private void a(wz $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cun.h.encode($$0, this.i);
   }

   @Override
   public zx<ahk> a() {
      return agt.bs;
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

   public cun g() {
      return this.i;
   }

   public Int2ObjectMap<cun> h() {
      return this.j;
   }

   public cqb i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
