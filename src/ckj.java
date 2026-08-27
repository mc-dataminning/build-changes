import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum ckj implements avj, cki {
   a("leather", 5, ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 1);
      $$0.put(ckh.a.c, 2);
      $$0.put(ckh.a.b, 3);
      $$0.put(ckh.a.a, 1);
   }), 15, arr.ai, 0.0F, 0.0F, () -> cpy.a(cna.qA)),
   b("chainmail", 15, ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 1);
      $$0.put(ckh.a.c, 4);
      $$0.put(ckh.a.b, 5);
      $$0.put(ckh.a.a, 2);
   }), 12, arr.ac, 0.0F, 0.0F, () -> cpy.a(cna.oB)),
   c("iron", 15, ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 2);
      $$0.put(ckh.a.c, 5);
      $$0.put(ckh.a.b, 6);
      $$0.put(ckh.a.a, 2);
   }), 9, arr.ah, 0.0F, 0.0F, () -> cpy.a(cna.oB)),
   d("gold", 7, ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 1);
      $$0.put(ckh.a.c, 3);
      $$0.put(ckh.a.b, 5);
      $$0.put(ckh.a.a, 2);
   }), 25, arr.ag, 0.0F, 0.0F, () -> cpy.a(cna.oF)),
   e("diamond", 33, ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 3);
      $$0.put(ckh.a.c, 6);
      $$0.put(ckh.a.b, 8);
      $$0.put(ckh.a.a, 3);
   }), 10, arr.ad, 2.0F, 0.0F, () -> cpy.a(cna.ov)),
   f("turtle", 25, ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 2);
      $$0.put(ckh.a.c, 5);
      $$0.put(ckh.a.b, 6);
      $$0.put(ckh.a.a, 2);
   }), 9, arr.ak, 0.0F, 0.0F, () -> cpy.a(cna.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 3);
      $$0.put(ckh.a.c, 6);
      $$0.put(ckh.a.b, 8);
      $$0.put(ckh.a.a, 3);
   }), 15, arr.aj, 3.0F, 0.1F, () -> cpy.a(cna.oG));

   public static final Codec<ckj> h = avj.a(ckj::values);
   private static final EnumMap<ckh.a, Integer> i = ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, 13);
      $$0.put(ckh.a.c, 15);
      $$0.put(ckh.a.b, 16);
      $$0.put(ckh.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<ckh.a, Integer> l;
   private final int m;
   private final arq n;
   private final float o;
   private final float p;
   private final aui<cpy> q;

   private ckj(String $$0, int $$1, EnumMap<ckh.a, Integer> $$2, int $$3, arq $$4, float $$5, float $$6, Supplier<cpy> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new aui<>($$7);
   }

   @Override
   public int a(ckh.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(ckh.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public arq b() {
      return this.n;
   }

   @Override
   public cpy d() {
      return this.q.a();
   }

   @Override
   public String e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.o;
   }

   @Override
   public float g() {
      return this.p;
   }

   @Override
   public String c() {
      return this.j;
   }
}
