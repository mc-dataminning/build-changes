import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface anv<T, R> {
   R apply(T var1) throws CommandSyntaxException;
}
