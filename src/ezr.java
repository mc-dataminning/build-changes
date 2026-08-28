import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ezr implements ezm {
   protected static final ezm a = new ezr(false, -Double.MAX_VALUE, cvx.k, $$0 -> false, null) {
      @Override
      public boolean a(fab $$0, jg $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cvx d;
   private final Predicate<ere> e;
   @Nullable
   private final btz f;

   protected ezr(boolean $$0, double $$1, cvx $$2, Predicate<ere> $$3, @Nullable btz $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected ezr(btz $$0, boolean $$1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:625)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:627)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1018)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:902)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:895)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual btz.ci ()Z
      // 05: aload 1
      // 06: invokevirtual btz.dE ()D
      // 09: aload 1
      // 0a: instanceof buv
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast buv
      // 14: invokevirtual buv.fb ()Lcvx;
      // 17: goto 1d
      // 1a: getstatic cvx.k Lcvx;
      // 1d: iload 2
      // 1e: ifeq 29
      // 21: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ezr.b (Lere;)Z, (Lere;)Z ]
      // 26: goto 46
      // 29: aload 1
      // 2a: instanceof buv
      // 2d: ifeq 41
      // 30: aload 1
      // 31: checkcast buv
      // 34: dup
      // 35: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 38: pop
      // 39: invokedynamic test (Lbuv;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, buv.a (Lere;)Z, (Lere;)Z ]
      // 3e: goto 46
      // 41: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ezr.a (Lere;)Z, (Lere;)Z ]
      // 46: aload 1
      // 47: invokespecial ezr.<init> (ZDLcvx;Ljava/util/function/Predicate;Lbtz;)V
      // 4a: return
   }

   @Override
   public boolean a(cvt $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(ere $$0, ere $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public fab a(dvd $$0, dee $$1, jg $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(fab $$0, jg $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(jl.a.b) - 1.0E-5F;
   }

   @Nullable
   public btz c() {
      return this.f;
   }
}
