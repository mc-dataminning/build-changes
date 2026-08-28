import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahl implements zw<agw> {
   public static final zn<xa, ahl> a = zw.a(ahl::a, ahl::new);
   private static final int b = 128;
   private static final zn<xa, Int2ObjectMap<cuq>> c = zl.a(Int2ObjectOpenHashMap::new, zl.d.a(Short::intValue, Integer::shortValue), cuq.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cqe h;
   private final cuq i;
   private final Int2ObjectMap<cuq> j;

   public ahl(int $$0, int $$1, int $$2, int $$3, cqe $$4, cuq $$5, Int2ObjectMap<cuq> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahl(xa $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cqe.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cuq.h.decode($$0);
   }

   private void a(xa $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cuq.h.encode($$0, this.i);
   }

   @Override
   public zy<ahl> a() {
      return agu.bs;
   }

   public void a(agw $$0) {
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

   public cuq g() {
      return this.i;
   }

   public Int2ObjectMap<cuq> h() {
      return this.j;
   }

   public cqe i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
