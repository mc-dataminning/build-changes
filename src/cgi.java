import java.util.EnumMap;
import java.util.function.Supplier;

public enum cgi implements asf, cgh {
   a("leather", 5, ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 1);
      $$0.put(cgg.a.c, 2);
      $$0.put(cgg.a.b, 3);
      $$0.put(cgg.a.a, 1);
   }), 15, aou.ai, 0.0F, 0.0F, () -> clw.a(ciz.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 1);
      $$0.put(cgg.a.c, 4);
      $$0.put(cgg.a.b, 5);
      $$0.put(cgg.a.a, 2);
   }), 12, aou.ac, 0.0F, 0.0F, () -> clw.a(ciz.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 2);
      $$0.put(cgg.a.c, 5);
      $$0.put(cgg.a.b, 6);
      $$0.put(cgg.a.a, 2);
   }), 9, aou.ah, 0.0F, 0.0F, () -> clw.a(ciz.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 1);
      $$0.put(cgg.a.c, 3);
      $$0.put(cgg.a.b, 5);
      $$0.put(cgg.a.a, 2);
   }), 25, aou.ag, 0.0F, 0.0F, () -> clw.a(ciz.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 3);
      $$0.put(cgg.a.c, 6);
      $$0.put(cgg.a.b, 8);
      $$0.put(cgg.a.a, 3);
   }), 10, aou.ad, 2.0F, 0.0F, () -> clw.a(ciz.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 2);
      $$0.put(cgg.a.c, 5);
      $$0.put(cgg.a.b, 6);
      $$0.put(cgg.a.a, 2);
   }), 9, aou.ak, 0.0F, 0.0F, () -> clw.a(ciz.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 3);
      $$0.put(cgg.a.c, 6);
      $$0.put(cgg.a.b, 8);
      $$0.put(cgg.a.a, 3);
   }), 15, aou.aj, 3.0F, 0.1F, () -> clw.a(ciz.nV));

   public static final asf.a<cgi> h = asf.a(cgi::values);
   private static final EnumMap<cgg.a, Integer> i = ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, 13);
      $$0.put(cgg.a.c, 15);
      $$0.put(cgg.a.b, 16);
      $$0.put(cgg.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cgg.a, Integer> l;
   private final int m;
   private final aot n;
   private final float o;
   private final float p;
   private final arj<clw> q;

   private cgi(String $$0, int $$1, EnumMap<cgg.a, Integer> $$2, int $$3, aot $$4, float $$5, float $$6, Supplier<clw> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new arj<>($$7);
   }

   @Override
   public int a(cgg.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cgg.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public aot b() {
      return this.n;
   }

   @Override
   public clw d() {
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
