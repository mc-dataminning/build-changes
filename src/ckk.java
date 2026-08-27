import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum ckk implements avk, ckj {
   a("leather", 5, ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 1);
      $$0.put(cki.a.c, 2);
      $$0.put(cki.a.b, 3);
      $$0.put(cki.a.a, 1);
   }), 15, ars.ai, 0.0F, 0.0F, () -> cpz.a(cnb.qA)),
   b("chainmail", 15, ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 1);
      $$0.put(cki.a.c, 4);
      $$0.put(cki.a.b, 5);
      $$0.put(cki.a.a, 2);
   }), 12, ars.ac, 0.0F, 0.0F, () -> cpz.a(cnb.oB)),
   c("iron", 15, ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 2);
      $$0.put(cki.a.c, 5);
      $$0.put(cki.a.b, 6);
      $$0.put(cki.a.a, 2);
   }), 9, ars.ah, 0.0F, 0.0F, () -> cpz.a(cnb.oB)),
   d("gold", 7, ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 1);
      $$0.put(cki.a.c, 3);
      $$0.put(cki.a.b, 5);
      $$0.put(cki.a.a, 2);
   }), 25, ars.ag, 0.0F, 0.0F, () -> cpz.a(cnb.oF)),
   e("diamond", 33, ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 3);
      $$0.put(cki.a.c, 6);
      $$0.put(cki.a.b, 8);
      $$0.put(cki.a.a, 3);
   }), 10, ars.ad, 2.0F, 0.0F, () -> cpz.a(cnb.ov)),
   f("turtle", 25, ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 2);
      $$0.put(cki.a.c, 5);
      $$0.put(cki.a.b, 6);
      $$0.put(cki.a.a, 2);
   }), 9, ars.ak, 0.0F, 0.0F, () -> cpz.a(cnb.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 3);
      $$0.put(cki.a.c, 6);
      $$0.put(cki.a.b, 8);
      $$0.put(cki.a.a, 3);
   }), 15, ars.aj, 3.0F, 0.1F, () -> cpz.a(cnb.oG));

   public static final Codec<ckk> h = avk.a(ckk::values);
   private static final EnumMap<cki.a, Integer> i = ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, 13);
      $$0.put(cki.a.c, 15);
      $$0.put(cki.a.b, 16);
      $$0.put(cki.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cki.a, Integer> l;
   private final int m;
   private final arr n;
   private final float o;
   private final float p;
   private final auj<cpz> q;

   private ckk(String $$0, int $$1, EnumMap<cki.a, Integer> $$2, int $$3, arr $$4, float $$5, float $$6, Supplier<cpz> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new auj<>($$7);
   }

   @Override
   public int a(cki.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cki.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public arr b() {
      return this.n;
   }

   @Override
   public cpz d() {
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
