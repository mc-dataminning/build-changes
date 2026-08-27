import java.util.EnumMap;
import java.util.function.Supplier;

public enum cgj implements ash, cgi {
   a("leather", 5, ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 1);
      $$0.put(cgh.a.c, 2);
      $$0.put(cgh.a.b, 3);
      $$0.put(cgh.a.a, 1);
   }), 15, aow.ai, 0.0F, 0.0F, () -> clx.a(cja.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 1);
      $$0.put(cgh.a.c, 4);
      $$0.put(cgh.a.b, 5);
      $$0.put(cgh.a.a, 2);
   }), 12, aow.ac, 0.0F, 0.0F, () -> clx.a(cja.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 2);
      $$0.put(cgh.a.c, 5);
      $$0.put(cgh.a.b, 6);
      $$0.put(cgh.a.a, 2);
   }), 9, aow.ah, 0.0F, 0.0F, () -> clx.a(cja.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 1);
      $$0.put(cgh.a.c, 3);
      $$0.put(cgh.a.b, 5);
      $$0.put(cgh.a.a, 2);
   }), 25, aow.ag, 0.0F, 0.0F, () -> clx.a(cja.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 3);
      $$0.put(cgh.a.c, 6);
      $$0.put(cgh.a.b, 8);
      $$0.put(cgh.a.a, 3);
   }), 10, aow.ad, 2.0F, 0.0F, () -> clx.a(cja.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 2);
      $$0.put(cgh.a.c, 5);
      $$0.put(cgh.a.b, 6);
      $$0.put(cgh.a.a, 2);
   }), 9, aow.ak, 0.0F, 0.0F, () -> clx.a(cja.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 3);
      $$0.put(cgh.a.c, 6);
      $$0.put(cgh.a.b, 8);
      $$0.put(cgh.a.a, 3);
   }), 15, aow.aj, 3.0F, 0.1F, () -> clx.a(cja.nV));

   public static final ash.a<cgj> h = ash.a(cgj::values);
   private static final EnumMap<cgh.a, Integer> i = ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, 13);
      $$0.put(cgh.a.c, 15);
      $$0.put(cgh.a.b, 16);
      $$0.put(cgh.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cgh.a, Integer> l;
   private final int m;
   private final aov n;
   private final float o;
   private final float p;
   private final ark<clx> q;

   private cgj(String $$0, int $$1, EnumMap<cgh.a, Integer> $$2, int $$3, aov $$4, float $$5, float $$6, Supplier<clx> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new ark<>($$7);
   }

   @Override
   public int a(cgh.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cgh.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public aov b() {
      return this.n;
   }

   @Override
   public clx d() {
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
