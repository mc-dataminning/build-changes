import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ejs implements ejn {
   protected static final ejn a = new ejs(false, -Double.MAX_VALUE, clb.b, $$0 -> false, null) {
      @Override
      public boolean a(ekb $$0, ht $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final clb d;
   private final Predicate<ecg> e;
   @Nullable
   private final bki f;

   protected ejs(boolean $$0, double $$1, clb $$2, Predicate<ecg> $$3, @Nullable bki $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected ejs(bki $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:625)
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
      // 02: invokevirtual bki.bV ()Z
      // 05: aload 1
      // 06: invokevirtual bki.ds ()D
      // 09: aload 1
      // 0a: instanceof bky
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast bky
      // 14: invokevirtual bky.eS ()Lclb;
      // 17: goto 1d
      // 1a: getstatic clb.b Lclb;
      // 1d: aload 1
      // 1e: instanceof bky
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast bky
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lbky;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, bky.a (Lecg;)Z, (Lecg;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ejs.a (Lecg;)Z, (Lecg;)Z ]
      // 3a: aload 1
      // 3b: invokespecial ejs.<init> (ZDLclb;Ljava/util/function/Predicate;Lbki;)V
      // 3e: return
   }

   @Override
   public boolean a(ckw $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(ecg $$0, ecg $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(ekb $$0, ht $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(hx.a.b) - 1.0E-5F;
   }

   @Nullable
   public bki c() {
      return this.f;
   }
}
